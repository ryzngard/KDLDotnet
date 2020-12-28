using System.Linq;
using Xunit;

namespace KdlDotnet.Tests
{
    public class ParseTests
    {
        [Fact]
        public void Test1()
        {
            var nodes = Parser.Parse("name first second third");
            Assert.Single(nodes);

            var node = nodes.Single();
            Assert.Equal("name", node.Name);
            Assert.Equal("first", node.Values[0].Value);
            Assert.Equal("second", node.Values[1].Value);
            Assert.Equal("third", node.Values[2].Value);
        }

        [Fact]
        public void Test2()
        {
            var input =
@"one two three four
five six seven eight";

            var nodes = Parser.Parse(input);

            Assert.Equal(2, nodes.Length);

            var node = nodes[0];
            Assert.Equal("one", node.Name);
            Assert.Equal("two", node.Values[0].Value);
            Assert.Equal("three", node.Values[1].Value);
            Assert.Equal("four", node.Values[2].Value);

            node = nodes[1];
            Assert.Equal("five", node.Name);
            Assert.Equal("six", node.Values[1].Value);
            Assert.Equal("seven", node.Values[2].Value);
            Assert.Equal("eight", node.Values[3].Value);
        }
    }
}
